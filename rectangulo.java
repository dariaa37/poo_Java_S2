// Karla Díaz Aguilar
// Elabore un programa en java el cual proporcione el perímetro y área de un rectángulo.

public class rectangulo {
    // Declaración de variables
    float base;
    float altura;

    // Metodos para iniciar ambos atributos
    public float establecerBase(float b){
        base = b;
        return base;
    }
    
    public float establecerAltura(float h){
        altura = h;
        return altura;
    }

    // Metodo para guardar ambos atributos
    public rectangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    // Metodos tipos Getters 
    public float getPerimetro(){
        float perimetro = 2*(base + altura);
        return perimetro;   
        // nota: (un getter no lleva parametros, solo retorna)
    }

    public float getArea(){
        float area = base * altura;
        return area;
    }
}
