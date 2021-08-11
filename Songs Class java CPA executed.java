/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class MyClass{
    
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        Songs song[]=new Songs[5];
        
        for(int i=0;i<5;i++){
            Songs s=new Songs();
            s.songName=sc.nextLine();
            s.duration=sc.nextInt();
            sc.nextLine();
            s.artists=sc.nextLine();
            s.language=sc.nextLine();
            s.rating=sc.nextDouble();
            sc.nextLine();
            song[i]=s;
        }
        
        //sc.nextLine();
        String lang=sc.nextLine();
        System.out.println("lang "+ lang);
        String arts=sc.nextLine();
        System.out.println("artists ip " + arts );
        
        sc.close();
        
        String res1[]=findSongBasedOnLanguage(song,lang);
        
        if(res1==null){
            System.out.println("There are no songs with given language");
        }
        else{
            for(int i=0;i<res1.length;i++){
                System.out.println(res1[i]);
            }
        }
        
        Songs res2[] =findSongBasedOnArtists(song,arts);
        
        if(res2==null){
            System.out.println("there is no such song with given artist");
            
        }
        else{
            
            for(int i=0;i<res2.length;i++){
                System.out.println(res2[i].songName);
                System.out.println(res2[i].rating);
            
            }
        }
    }
    
    public static String[] findSongBasedOnLanguage(Songs []s,String str){
        
       ArrayList<String> list=new ArrayList();
        int j=0;
        for(int i=0;i<5;i++){
            if(s[i].language.equalsIgnoreCase(str)){
                list.add(s[i].songName);
                j++;
            }
        }
        
        //String[] arr = newList.toArray(new String[newList.size()])
        if(j==0){
            return null;
        }
        else{
            String arr[]=list.toArray(new String[list.size()]);
            return arr;
            
        }
        
    }
    
    public static Songs[] findSongBasedOnArtists(Songs s[],String str){
        ArrayList<Songs> list =new ArrayList();
        int j=0;
        
        for(int i=0;i<5;i++){
            if(s[i].artists.equalsIgnoreCase(str)){
                list.add(s[i]);
                j++;
            }
        }
        
        Songs arr[]=list.toArray(new Songs[list.size()]);
        // //for(int i=0; i < n; i++){  
        //          for(int j=1; j < (n-i); j++){  
        //                   if(arr[j-1] > arr[j]){  
        //                          //swap elements  
        //                          temp = arr[j-1];  
        //                          arr[j-1] = arr[j];  
        //                          arr[j] = temp;  
                        //  }  
                        
        for(int i=0;i<j;i++){
            for(int k=1;k<(j-i);k++){
                System.out.println("....in loop before if check ....");
                if(arr[k-1].rating > arr[k].rating){
                    System.out.println("....in loop after if check ....");
                    Songs temp=arr[k-1];
                    arr[k-1]=arr[k];
                    arr[k]=temp;
                }
            }
        }
        
        if(j==0){
            return null;
        }
        else{
            return arr;
        }
        
        
    }
}


class Songs{
    
    public String songName;
    public int duration;
    public String artists;
    public String language;
    public double rating;
    
    public Songs(){
        this.songName="";
        this.duration=0;
        this.artists="";
        this.language="";
        this.rating=0;
        
    }
    
}
