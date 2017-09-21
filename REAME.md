# boot example

## 发布历史 
- 加载第一个controller

- json换fastjson
    -   如果使用json，在返回VO时，如果字段没有被赋值，那么该字段就会显示为null, 如果是date会转换成为时间戳
    ``
    {
    id: 111111,
    name: null,
    sex: false,
    created: 1505985922932
    }
    ``
   