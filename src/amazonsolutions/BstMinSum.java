package amazonsolutions;

public class BstMinSum {
	public static int minTreePath(TNode t) {
		int max[] = new int[1];
		max[0] = Integer.MAX_VALUE;
		int result = calculateSum(t, max);
		return max[0];
	}

	public static int calculateSum(TNode root, int[] max) {
		if (root == null)
			return 0;

		int left = calculateSum(root.left, max);
		int right = calculateSum(root.right, max);

		int current = Math.min(root.value, Math.max(root.value + left, root.value + right));

		max[0] = Math.min(max[0], Math.max(current, left + root.value + right));

		return current;
	}

	public class TNode {
		public int value;
		public TNode left;
		public TNode right;
	}

}