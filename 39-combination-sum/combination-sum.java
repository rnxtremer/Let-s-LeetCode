class Solution {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> combinations = new ArrayList<>();
    dfs(candidates, 0, target, new ArrayList<>(), combinations);
    return combinations;
  }

  private void dfs(int[] candidates, int index, int target, List<Integer> current, List<List<Integer>> combinations) {
    if (target == 0) {
      combinations.add(new ArrayList<>(current)); 
      return;
    }

    if (index < candidates.length && target > 0) {
      current.add(candidates[index]);
      dfs(candidates, index, target - candidates[index], current, combinations); 
      current.remove(current.size() - 1); 
      dfs(candidates, index + 1, target, current, combinations); 
    }
  }
}
