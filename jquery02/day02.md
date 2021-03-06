# 一.开发过程中遇到的对象
## 1.通过$得到的是jQuery对象

	$("p:first")
	$(btn)
	$("<li>天津</li>")

## 2.调用修改方法得到的是jQuery对象

	obj.html("abc")
	obj.val("BBB")
	obj.attr("src","../images/02.jpg")

## 3.若查到的是节点则为jQuery对象

	obj.children()
	obj.next()
	obj.siblings()

## 4.若查到的是文本则为DOM对象

	obj.html()
	obj.val()
	obj.attr("src")

## 5.万能的办法
- 控制台输出这个对象,若是数组则为jQuery对象,反之为DOM对象

# 二.jQuery事件
## 1.事件概述
### 1)什么是事件
- 和js一样

### 2)事件的分类
- 和js一样

## 2.事件定义
### 1)直接定义事件
- 和js一样

### 2)动态绑定事件(*)
- $(function(){})
- $(":button").click(function(){})
> onload只能写一次,否则后者会覆盖前者,而$(fn)可以写多次.
> onload是整个网页加载完触发,而$(fn)是标签加载完就触发.

### 3)取消事件
- 和js一样

## 3.事件对象
### 1)什么是事件对象
- 和js一样
> jQuery重新对事件对象做了封装,改变的内容见4节

### 2)如何获得事件对象
#### 直接定义事件时
- 和js一样

#### 动态绑定事件时
- 和js一样

## 4.事件机制
### 1)冒泡机制
- 和js一样

### 2)取消冒泡
- e.stopPropagation()

### 3)作用
- 和js一样

### 4)事件源
- e.target

## 5.合成事件(了解)
- hover = onmouseover + onmouseout
- toggle : 让元素在显示和隐藏之间切换

## 6.模拟操作
- trigger("click")