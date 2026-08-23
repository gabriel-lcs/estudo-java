Fazer um programa para ler os dados de N figuras (N fornecido pelo usuário), e depois mostrar as áreas destas figuras na mesma ordem em que foram digitadas

```mermaid
classDiagram
    class Shape {
        - color : Color
        + area() Double
    }

    class Rectangle {
        - width : Double
        - height : Double
    }

    class Circle {
        - radius : Double
    }

    class Color {
        <<enumeration>>
        - BLACK : int
        - BLUE : int
        - RED : int
    }


    Shape <|-- Rectangle

    Shape <|-- Circle


```