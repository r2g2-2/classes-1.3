import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // הגדר רשימה של מלבנים
        Rectangle[] rectangle = new Rectangle[3];
        // אתחל את השטח הגדול ביותר והשטח הכולל
        int areaSum = 0 , largeArea = 0,area;
        // בונה את כל המלבנים
        for (int i = 0; i < 2; i++)
        {
            // קלוט צבע
            System.out.println("pleas enter color rectangle " + (i + 1) );
            int color = input.nextInt();
            // קלוט אורך
            System.out.println("pleas enter length ");
            int length = input.nextInt();
            // קלוט רוחב
            System.out.println("pleas width");
            int width = input.nextInt();
            // שמור נתוני מלבן
            Rectangle rectangleInfo = new Rectangle(color, length, width);
            rectangle[i] = rectangleInfo;
            //הוסף למשתנה של סכום השטחים את שטח המלבן הנוכחי
            areaSum+=rectangle[i].area();
            area=rectangle[i].area();
            //מצא את המלבן בעל השטח הכי גדול
            if (area>largeArea)
            {
                largeArea = rectangle[i].getColor();
            }
        }
        //קלוט צבע חדש
        System.out.println("enter color:");
        int color = input.nextInt();
        //הפוך את כל המלבנים לצבע החדש
        for (int i=0; i<2; i++)
        {
            rectangle[i].setColor(color);
        }
        System.out.println(areaSum);
        System.out.println(largeArea);
        System.out.println(rectangle[1].getColor());

    }
}