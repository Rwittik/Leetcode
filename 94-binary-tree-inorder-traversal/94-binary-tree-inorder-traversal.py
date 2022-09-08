# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
#     def preorder(root):
#   return [root.val] + preorder(root.left) + preorder(root.right) if root else []

# def postorder(root):
#   return  postorder(root.left) + postorder(root.right) + [root.val] if root else []
class Solution:
    def inorderTraversal(self, root):
        res = []
        self.helper(root, res)
        return res
    
    def helper(self, root, res):
        if root:
            self.helper(root.left, res)
            res.append(root.val)
            self.helper(root.right, res)




        