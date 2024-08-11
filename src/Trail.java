import java.awt.*;
import java.util.ArrayList;

public class Trail{

    ArrayList<Point> points = new ArrayList<Point>();
    int mx;
    int my;

    public Trail(){
        points = new ArrayList<Point>(100);
    }

    void paint(Graphics g, Point p){
        
        while(moving(p)){
            while(points.size()>=100) {
                points.remove(0);
            }
            points.add(p);

        }

        for(Point xy : points) {
            g.setColor(Color.GRAY);
            g.setColor(new Color(100, 100, 100, 80));
            g.fillOval(xy.x, xy.y, 30, 30);
        }
    }


    boolean moving(Point p){
        if(mx!=p.x||my!=p.y){ 
            mx = p.x; 
            my = p.y;
            return true;
        } else{
            return false;
        }
    }
}
