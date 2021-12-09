package padrao.prototype;

public class IdInfo implements Cloneable{
    private int numeroId;
    private String orgaoEmissor;

    public IdInfo(int numeroId, String orgaoEmissor) {
        super();
        this.numeroId = numeroId;
        this.orgaoEmissor = orgaoEmissor;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "IdInfo{" +
                "numero=" + numeroId +
                ", orgao emissor=" + orgaoEmissor + '}';
    }
}
