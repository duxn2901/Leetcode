package leetcode;

public class P2409 {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        
        int arrive1 = dateInYear(arriveAlice);
        int arrive2 = dateInYear(arriveBob);
        int leave1 = dateInYear(leaveAlice);
        int leave2 = dateInYear(leaveBob);

        if (arrive1>leave2 || arrive2>leave1) return 0;
        if ((arrive1>=arrive2 && leave1<=leave2) || (arrive2>=arrive1 && leave2<=leave1)) return Math.min(leave1 - arrive1, leave2 - arrive2)+1;
        return (arrive1<=arrive2) ? leave1 - arrive2 + 1 : leave2 - arrive1 + 1;

        
    }
    public int dateInYear(String n){
        int[] year = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = Integer.parseInt(n.substring(0,2));
        int day = Integer.parseInt(n.substring(3));
        int date = 0;
        for (int i = 0; i<month-1; i++) date += year[i];
        return date + day;
    }
}
