## 本目录下的内容对之前的xsd进行了修改，以适配作业需求
之前作业的schema设计中，作业要求最终设计结果要兼容给出的ScoreList.xsd
一开始的理解是引用那个xsd，但看了作业4(xslt)的要求后发现"兼容"似乎不是
这么一回事，兼容应该是说我们设计出的schema应该包含所有ScoreList.xsd的
信息(虽然理论上直接引用也没错，也包含了所有信息), 但是如果直接引用的话就
没有办法充分体现出xslt转换的这样一个过程，而且这也不是非常符合大部分的xml
实际场景，故在此项目中对之前的schema设计做出一些修改，主要是和ScoreList
相关的部分