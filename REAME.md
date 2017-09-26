# boot example

## 发布历史 
- 加载第一个controller
    - 使用@GetMapping 不需要声明@ResponseBody

- json换fastjson
    -   如果使用json，在返回VO时，如果字段没有被赋值，那么该字段就会显示为null
    ``
    {
    id: 111111,
    name: null,
    sex: false,
    created: 1505985922932
    }
    ``
- @ControllerAdvice 控制器增强的用法

- jpa操作数据库
   