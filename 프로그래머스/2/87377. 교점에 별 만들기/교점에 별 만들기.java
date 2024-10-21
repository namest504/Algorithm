import java.util.*;

class Solution {
    
    // 좌표를 저장할 객체
    private static class Point {
        public final long x, y;
        private Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
    
    // 교차로를 구하는 함수
    private Point intersection(long a, long b, long e, long c, long d, long f) {
        
        double x = (double) (b*f-e*d)/(a*d-b*c);
        double y = (double) (e*c-a*f)/(a*d-b*c);
        
        if(x%1 != 0 || y%1 != 0) {
            return null;
        }
    	return new Point((long) x, (long) y);
    }
    
    private Point getMinPoint(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;
        
        for(Point p : points) {
            if(p.x < x) x = p.x;
            if(p.y < y) y = p.y;
        }
        return new Point(x, y);
    }
    private Point getMaxPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;
        
        for(Point p : points) {
            if(p.x > x) x = p.x;
            if(p.y > y) y = p.y;
        }
        return new Point(x, y);
    }
    
    public String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();
        for(int i = 0; i < line.length; i++) {
            for(int j = i+1; j < line.length; j++) {
                Point inters = intersection(
                    line[i][0],line[i][1],line[i][2],
                    line[j][0],line[j][1],line[j][2]
                );
                if(inters != null) {
                    points.add(inters);
                }
            }
        }
        Point minPoint = getMinPoint(points);
        Point maxPoint = getMaxPoint(points);
        
        int width = (int) (maxPoint.x - minPoint.x + 1);
        int height = (int) (maxPoint.y - minPoint.y + 1);
        
        char[][] arr = new char[height][width];
        for(char[] row : arr) {
            Arrays.fill(row, '.');
        }
        
        for(Point p : points) {
            int x = (int) (p.x - minPoint.x);
            int y = (int) (maxPoint.y - p.y);
            arr[y][x] = '*';
        }
        
		String[] answer = new String[arr.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = new String(arr[i]);
        }
        return answer;
    }
}