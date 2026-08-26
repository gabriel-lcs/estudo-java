Fazer um programa par ler os dados de uma reserva de hotel (número do quarto, data de entrada e data de saída) e mostrar os dados de reserva, inclusive sua duração em dias. Em seguida, ler nova datas de entrada e saída, atualizar a reserva, e mostrar novamente a reserva com os dados atualizados. O programa não deve aceitar dados inválidos para a reserva, conforme as seguintes regras:

- Alterações de reserva só podem ocorrer para datas futuras
- A data de saída deve ser maior que a data de entrada


```mermaid
classDiagram
    class Reservation {
        - roomNumber : Integer
        - checkin : Date
        - checkout : Date
        + duration() Integer
        + updateDates(checkin : Date, checkout : Date) void
    }

    
```