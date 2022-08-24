package programmer.zaman.now.data;

// Parameter diset default final
public record LoginRequest(String username, String password)  {
    // Compact Constructor: dont need ()
    public LoginRequest{
        System.out.println("Membuat objek LoginRequest");
    }
    // Harus mengikuti constructor induk
    public LoginRequest(String username){
        this(username,"");
    }
    public LoginRequest(){
        this("","");
    }

}
