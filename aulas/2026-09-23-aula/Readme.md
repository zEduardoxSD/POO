# Diagrama de classes UML

```java
public class pessoa{
    private string nome;
}
```






## Diagrama UML


```mermaid
    classDiagram
        class Retangulo{
            - int altura
            - int largura
            + Retangulo(al: int, la: int)
            + getArea() int
        }

```
# Associação entre Classes

```mermaid
classDiagram
    direction LR
    class Carro{
    - marca: String
    - propulsor: Motor
    + Carro()
    +acelerar(v:int)void 
    }
 
 class Motor{
        -hp: int
        -giroAtual: int
        -cilindros: int
        +Motor()
        +acelerar(v:int)void
    }
    Carro o-- Motor
    
    
```