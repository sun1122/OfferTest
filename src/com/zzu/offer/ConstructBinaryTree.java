package com.zzu.offer;

public class ConstructBinaryTree {

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {

        if (pre == null || in == null || pre.length == 0 || in.length == 0) {

            return null;
        }


        return buildTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    public TreeNode buildTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {

        //前序遍历的第一个数字是根节点
        TreeNode root = new TreeNode(pre[preStart]);

        //在中序中遍历找到根节点的值
        int rootIndex = 0;
        for (; rootIndex < in.length; rootIndex++) {

            if (root.val == in[rootIndex]) {
                break;
            }
        }

        //左子树长度
        int leftLength = rootIndex - inStart;
        //右子树长度
        int rightLength = inEnd - rootIndex;

        if(leftLength>0){
            //构建左子树
            root.left = buildTree(pre, preStart+1, preStart+leftLength, in, inStart, rootIndex-1);
        }
        if(rightLength >0){
            //构建右子树
            root.right= buildTree(pre, preStart+leftLength+1,preEnd,in,rootIndex+1,inEnd);
        }

        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
