package com.lei.prototype;
/**
 * 使用原型模式.
 * 原型模式主要解决的问题是创建大量重复的类,我们模拟的场景就是给不同的用户都创建向他们的试卷,但是这些试卷的题目不便于每次都从库中获取,甚至有时候需要从远程的RPC中获取.这些都是耗时的操作,所以我们可以使用原型模式来解决这个问题.
 * 原型模式中重要的一个概念就是深拷贝和浅拷贝(克隆),这个在后面的代码中会有体现.
 */
