package application;

import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many posts you want make: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Post> posts = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Title: ");

            String title = scanner.nextLine();

            System.out.print("Content: ");
            String content = scanner.nextLine();

            System.out.print("Moment: ");
            String moment = scanner.nextLine();

            System.out.print("Likes: ");
            int likes = scanner.nextInt();

            Post post = new Post(LocalDateTime.parse(moment, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")), title, content, likes);

            posts.add(post);

            System.out.print("How many comments: ");
            int j = scanner.nextInt();
            scanner.nextLine();

            for (int k = 0; k < j; k++) {
                System.out.printf("Comment%d : ", k + 1);
                String comentario = scanner.nextLine();
                Comment comment = new Comment(comentario);
                post.addComent(comment);
            }

        }

        for (Post post : posts){
            System.out.println(post);
        }

        scanner.close();
    }
}
