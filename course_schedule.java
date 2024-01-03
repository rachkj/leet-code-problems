class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> preMap = new HashMap<>();
        
        for (int i = 0; i < numCourses; i++) {
            preMap.put(i, new ArrayList<>());
        }
        
        for (int[] prerequisite : prerequisites) {
            int crs = prerequisite[0];
            int pre = prerequisite[1];
            preMap.get(crs).add(pre);
        }

        Set<Integer> visitSet = new HashSet<>();

        for (int crs = 0; crs < numCourses; crs++) {
            if (!dfs(crs, preMap, visitSet)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int crs, Map<Integer, List<Integer>> preMap, Set<Integer> visitSet) {
        if (visitSet.contains(crs)) {
            return false;
        }
        if (preMap.get(crs).isEmpty()) {
            return true;
        }

        visitSet.add(crs);
        for (int pre : preMap.get(crs)) {
            if (!dfs(pre, preMap, visitSet)) {
                return false;
            }
        }
        visitSet.remove(crs);
        preMap.get(crs).clear();
        return true;
    }
}
