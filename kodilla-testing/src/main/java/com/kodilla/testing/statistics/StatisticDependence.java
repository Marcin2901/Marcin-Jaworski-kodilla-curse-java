package com.kodilla.testing.statistics;


public class StatisticDependence {

    Statistics statistics;
    int liczbaPostow;
    int liczbaComment;
    int liczbaUsers;
    int postNaUser;
    int comentNaUser;
    int commentNaPost;

    public StatisticDependence(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){
       liczbaUsers = statistics.usersNames().size();
       liczbaPostow = statistics.postsCount();
       liczbaComment = statistics.commentsCount();
           if(liczbaUsers!=0)
       postNaUser = liczbaPostow/liczbaUsers;
        if(liczbaUsers!=0)
       comentNaUser = liczbaComment/liczbaUsers;
        if(liczbaPostow!=0)
       commentNaPost = liczbaComment/liczbaPostow;


    }

//
//   public List<String> usersNames(){
//        List<String> lista = new ArrayList<>();
//        lista.add("Tomek");
//        lista.add("Krzysiek");
//        return  lista;
  // } // list of users names
//  public  int postsCount(){
//        return 1;
//  }          // total quantity of forum posts
//   public int commentsCount(){
//        return 0;
//   }




    @Override
    public String toString() {
        return "StatisticDependence{" +
                "liczbaPostow=" + liczbaPostow +
                ", liczbaComment=" + liczbaComment +
                ", liczbaUsers=" + liczbaUsers +
                ", PostNaUser=" + postNaUser +
                ", ComentNaUser=" + comentNaUser +
                ", CommentNaPost=" + commentNaPost +
                '}';
    }
}
