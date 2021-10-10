public class Scanner {
    private int UPCCode;
    public void ScannedUPCCode(int UPCCode){
        this.UPCCode = UPCCode;
    }
    public int GetScannedUPCCode(){
        int Code = this.UPCCode;
        this.UPCCode = -1;
        return Code;
    }
}
