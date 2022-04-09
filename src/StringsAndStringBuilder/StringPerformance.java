package StringsAndStringBuilder;

public class StringPerformance {
    public static void main(String[] args){
        String series ="";
        StringBuilder buildSeries = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            System.out.println(ch);
            series += ch;
            buildSeries.append(ch);
        }
        System.out.println(series);
        System.out.println(buildSeries);
        buildSeries.reverse();
        System.out.println(buildSeries);
    }
}
