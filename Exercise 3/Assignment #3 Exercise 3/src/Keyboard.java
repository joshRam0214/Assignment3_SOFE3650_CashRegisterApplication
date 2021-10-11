public class Keyboard {
    private int UPCCocde;
    public void setUPCCode(int UPCCode){
        this.UPCCocde = UPCCode;
    }
    public int GetUPCCode(){
        int Code = this.UPCCocde;
        this.UPCCocde = -1;
        return Code;
    }
}
