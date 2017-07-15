<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>layui</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link href="/lib/layui/css/layui.css" rel="stylesheet" media="all">
</head>
<body>
    <div class="content">
        <div>
            <ul class="layui-nav">
                <li class="layui-nav-item"><a href="">最新活动</a></li>
                <li class="layui-nav-item layui-this">
                    <a href="javascript:;">产品</a>
                    <dl class="layui-nav-child">
                        <dd><a href="">选项1</a></dd>
                        <dd><a href="">选项2</a></dd>
                        <dd><a href="">选项3</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="">大数据</a></li>
                <li class="layui-nav-item">
                    <a href="javascript:;">解决方案</a>
                    <dl class="layui-nav-child">
                        <dd><a href="">移动模块</a></dd>
                        <dd><a href="">后台模版</a></dd>
                        <dd class="layui-this"><a href="">选中项</a></dd>
                        <dd><a href="">电商平台</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="">社区</a></li>
            </ul>
        </div>
        <div>
            <ul class="layui-nav layui-nav-tree" lay-filter="demo">
                <li class="layui-nav-item layui-nav-itemed">
                    <a href="javascript:;">默认展开</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">选项一</a></dd>
                        <dd><a href="javascript:;">选项二</a></dd>
                        <dd><a href="javascript:;">选项三</a></dd>
                        <dd><a href="">跳转项</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">解决方案</a>
                    <dl class="layui-nav-child">
                        <dd><a href="">移动模块</a></dd>
                        <dd><a href="">后台模版</a></dd>
                        <dd><a href="">电商平台</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="">云市场</a></li>
                <li class="layui-nav-item"><a href="">社区</a></li>
            </ul>
        </div>
    </div>
</body>
<script src="/lib/layui/layui.js" charset="utf-8"></script>
<script>
    layui.use(['element', 'layer'], function(){
        var element = layui.element(); //导航的hover效果、二级菜单等功能，需要依赖element模块

        //监听导航点击
        element.on('nav(demo)', function(elem){
            //console.log(elem)
            layer.msg(elem.text());
        });
    });
</script>
</html>
