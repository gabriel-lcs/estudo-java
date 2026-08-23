Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário, deseja-se registrar nome, horas trabalhadas e valor por hora. Funcionários terceirizados possuem ainda uma despesa adicional. 

O pagamento dos funcionários corresponde ao valor da obra multiplicado pelas horas trabalhadas, sendo que os funcionários terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.

Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista. Depois de ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados. 

Construa o programa conforme projeto ao lado.

```mermaid
classDiagram
    class Employee {
        - name : String
        - hours : Integer
        - valuePerHour : Double
        + payment() Double
    }

    class OutsourcedEmployee {
        - additionalCharge : Double
    }


    Employee <|-- OutsourcedEmployee  
    
    
```