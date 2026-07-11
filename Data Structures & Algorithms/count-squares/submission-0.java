class CountSquares {

    private Map<Integer, Map<Integer, Integer>> points;

    public CountSquares() {
        points = new HashMap<>();
    }
    
    public void add(int[] point) {
        int x = point[0];
        int y = point[1];

        points.putIfAbsent(x, new HashMap<>());
        Map<Integer, Integer> yMap = points.get(x);
        yMap.put(y, yMap.getOrDefault(y, 0) + 1);
    }
    
    public int count(int[] point) {
        int qx = point[0];
        int qy = point[1];
        int totalSquares = 0;

        if (!points.containsKey(qx)) return 0;
        for (int y : points.get(qx).keySet()) {
            if (y == qy) continue;
            int sideLength = Math.abs(qy - y);
            int[] xs = {qx - sideLength, qx + sideLength};

            for (int x : xs) {
                if (points.containsKey(x)) {
                    int countXy = points.get(x).getOrDefault(y, 0);
                    int countXqy = points.get(x).getOrDefault(qy, 0);
                    int countQxY = points.get(qx).get(y);
                    totalSquares += (countXqy * countXy * countQxY);
                }
            }
        }
        return totalSquares;
    }
}
