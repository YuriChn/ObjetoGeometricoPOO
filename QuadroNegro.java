public class QuadroNegro {
    private Quadrado quadrado;
    private Retangulo retangulo;
    private Circunferencia circunferencia;
    private Triangulo triangulo;

    public void limpaQuadro() {
        quadrado = null;
        retangulo = null;
        circunferencia = null;
        triangulo = null;
    }

    public void criaQuadrado(double l) {
        quadrado = new Quadrado(l);
    }

    public void criaRetangulo(double c, double a) {
        retangulo = new Retangulo(c, a);
    }

    public void criaCircunferencia(double r) {
        circunferencia = new Circunferencia(r);
    }

    public void criaTriangulo(double b, double a) {
        triangulo = new Triangulo(b, a);
    }

    public void mostraAreaObjetos() {
        if (quadrado != null)
            System.out.println("Quadrado. Área: " + quadrado.getArea());
        if (retangulo != null)
            System.out.println("Retângulo. Área: " + retangulo.getArea());
        if (triangulo != null)
            System.out.println("Triângulo. Área: " + triangulo.getArea());
        if (circunferencia != null)
            System.out.println("Circunferência. Área: " + circunferencia.getArea());
    }

    public void mostraPerimetroObjetos() {
        if (quadrado != null)
            System.out.println("Quadrado. Perímetro: " + quadrado.getPerimetro());
        if (retangulo != null)
            System.out.println("Retângulo. Perímetro: " + retangulo.getPerimetro());
        if (triangulo != null)
            System.out.println("Triângulo. Perímetro: " + triangulo.getPerimetro());
        if (circunferencia != null)
            System.out.println("Circunferência. Perímetro: " + circunferencia.getPerimetro());
    }

    public void mostraCorObjetos() {
        if (quadrado != null)
            System.out.println("Quadrado. Cor: " + quadrado.getCor());
        if (retangulo != null)
            System.out.println("Retângulo. Cor: " + retangulo.getCor());
        if (triangulo != null)
            System.out.println("Triângulo. Cor: " + triangulo.getCor());
        if (circunferencia != null)
            System.out.println("Circunferência. Cor: " + circunferencia.getCor());
    }

    public static void main(String args[]) {
        QuadroNegro quadroNegro = new QuadroNegro();
        quadroNegro.criaQuadrado(10.6);
        quadroNegro.criaRetangulo(50.5, 20.4);
        quadroNegro.criaTriangulo(6.7, 5.5);
        quadroNegro.criaCircunferencia(10);

        quadroNegro.mostraAreaObjetos();
        quadroNegro.mostraPerimetroObjetos();
    }
}

abstract class ObjetoGeometrico {
    public double area;
    private double perimetro;
    protected String cor;

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    protected String getCor() {
        return cor;
    }

    protected void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    protected void setCor(String cor) {
        this.cor = cor;
    }
}

class Quadrado extends ObjetoGeometrico {
    private double lado;

    public Quadrado(double l) {
        this.lado = l;
        this.area = lado * lado;
        setPerimetro(4 * lado);
    }
}

class Retangulo extends ObjetoGeometrico {
    private double comprimento;
    private double altura;

    public Retangulo(double c, double a) {
        this.comprimento = c;
        this.altura = a;
        this.area = comprimento * altura;
        setPerimetro(2 * (comprimento + altura));
    }
}

class Circunferencia extends ObjetoGeometrico {
    private static final double PI = 3.141618;
    private double raio;

    public Circunferencia(double r) {
        this.raio = r;
        this.area = PI * raio * raio;
        setPerimetro(2 * PI * raio);
    }
}

class Triangulo extends ObjetoGeometrico {
    public double base;
    public double altura;

    public Triangulo(double b, double a) {
        this.base = b;
        this.altura = a;
        this.area = (base * altura) / 2;
        setPerimetro(3 * base);
    }
}
