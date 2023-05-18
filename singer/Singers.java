import java.util.ArrayList;

public class Singers {
    private ArrayList<String> singer_list = new ArrayList<String>();

    public void singers_print(){
        System.out.println(" On the Singer List " + singer_list.size() + " how many singers. ");

        for(int i = 0; i < singer_list.size(); i++){
            System.out.println((i+1) + ".Singer :" + singer_list.get(i));
        }


    }

    public void singer_add(String name){
        singer_list.add(name);

        System.out.println("Updated singer list...");
    }

    public void singer_update(String new_name, int position){
        singer_list.set(position,new_name);
        System.out.println("Updated singer list...");
    }

    public void singer_delete(int position){

        String name = singer_list.get(position);
        singer_list.remove(position);

        System.out.println(name + " Singer named has been deleted from the list... ");

    }

    public void singer_search(String singer_name){

        int position = singer_list.indexOf(singer_name);

        if(position >= 0){
            System.out.println("Singer found.");
            System.out.println(singer_name + " singer named " + (position+1) + ". in position ");

        }else{
            System.out.println(" Singer is not found... ");
        }


    }

}
