package module3;

public class MysteryWho {
    public static void main(String[] arg){
        String whom = "her",
        who = "him",
        it = "who",
        he = "it",
        she = "whom";

        sentences(he, she, it);
        sentences(she, he ,who);
        sentences(who, she, who);
        sentences(it, "stu", "boo");
        sentences(it, whom, who);
    }
    public static void sentences(String she, String who, String whom){
        System.out.println(who+ " and "+ whom +" like "+she);
    }
}
