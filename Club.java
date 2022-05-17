public class Club{
    private Member list[];
    public Club(){list=new Member[20];}
    public void addMember(Member m){
        for(int i=0;i<list.length;i++){
            if(list[i]==null){
                list[i]=m;
                break;
            }
        }
    }
    public int totalFee(){
        int total=0;
        for(int i=0;i<list.length;i++){
            if(list[i]!=null){
                total+=list[i].getFee();
            }
        }
        return total;
    }
    public String toString(){
        String message="";
        for(int i=0;i<list.length;i++){
            if(list[i]!=null){
                message+=list[i]; //呼叫toString
            }
        }
        return message;
    }
}