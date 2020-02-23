package capitulo.pkg10.ejercicio.pkg10;

public class Faculty extends CollageEmployee {
    private boolean tenured;

    @Override
    public String display() {
        return "Faculty: "+ super.display()+
               "\nTenured:"+tenured;
    }

    public boolean isTenured() {
        return tenured;
    }

    public void setTenured(boolean tenured) {
        this.tenured = tenured;
    }
}
