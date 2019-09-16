var middleObj =
    (function(){
        var tool = {};
        var tempObj ={
            init:function(obj){
                this.tool = obj;
            },
            formSubmit: function(obj, type) {
                this.removeEle();
                var turnForm = document.createElement("form");
                turnForm.setAttribute("id", "middleForm");
                document.body.appendChild(turnForm);
                turnForm.method = "POST";
                //默认为当前页面
                if (type) {
                    turnForm.action = '/middle/' + type;
                } else {
                    turnForm.action = '/middle';
                }
                //创建隐藏表单
                for(var item in obj){
                    var newElement = document.createElement("input");
                    newElement.setAttribute("type","hidden");
                    newElement.setAttribute("name", item);
                    newElement.setAttribute("value",obj[item]);
                    turnForm.appendChild(newElement);
                }

                turnForm.submit();
            },
            removeEle: function() {
                var elem = document.getElementById("middleForm");
                if(elem) {
                    elem.remove();
                }
            }

        };
        var outputObj =function(){
            tempObj.init();
            return tempObj;
        };
        return new outputObj();
    })();