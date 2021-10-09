package com.example.myapplication
class Node(value:Int){
    var value:Int
    var left:Node?
    var right:Node?
    init {
        this.value = value
        this.left = null
        this.right = null
    }
}
fun preorder(root:Node){
    if(root==null)
        return;
    print(root.value)
    root.left?.let { preorder(it) }
    root?.right?.let { preorder(it) }

}
fun main(){
   var root:Node=Node(5)
   root.left= Node(4)
   root.right= Node(6)
    (root.left)?.left =Node(7)
    (root.left)?.right= Node(8)

    preorder(root)

}