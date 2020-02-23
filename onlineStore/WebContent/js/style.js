function init(){
    //搜索结果页面默认不显示
    var result = document.getElementById("table_searchResult");
    if(result != null){
    	result.style="display:none";
    }
}

init();

function search(){
    //点击搜索后展示页隐藏
    document.getElementById("table_show").style="display:none";
    document.getElementById("table_searchResult").style="display:block";
}