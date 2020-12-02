package leetcode.Tree;

import 剑指Offer.easy.TreeNode;

/**
 * 543. 二叉树的直径
 * tree deep-node
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 *
 *
 *
 *
 */
public class _0543 {

    static class Solution {
        int maxd=0;
        public int diameterOfBinaryTree(TreeNode root) {
            depth(root);
            return maxd;
        }
        public int depth(TreeNode node){
            if(node==null){
                return 0;
            }
            int Left = depth(node.left);
            int Right = depth(node.right);
            maxd=Math.max(Left+Right,maxd);//将每个节点最大直径(左子树深度+右子树深度)当前最大值比较并取大者
            return Math.max(Left,Right)+1;//返回节点深度
        }

    }
}

