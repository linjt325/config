(function($){
	$.configuration=function(t,p){
		var configuration={
			initParam:function(t,p){
				configuration.t=t;
				configuration.p=$.extend(true,{
					containerStyle:{	//背景容器的样式
						background:"url(images/loading.gif) white center center no-repeat",
						position:"relative",
						width:"800px",
						height:"600px",
						border:"2px solid black",
					},
					labelStyle:{		//数据标签的样式
						color:"black",
						height:"25px",
						fontSize:"12px",
						position:"absolute"
					},
					pointModel:{		//点位数据模型
						pointKey:"p",
						labels:[]
					},
					dataModel:{			//数据模型
						pointKey:"p"
					},
					labelModel:{		//数据标签模型
						left:0,			
						top:0,
						title:"",		
						name:"",
						unit:"",
						color:"",
						weight:"",
						defaults:"",
						format:function(value){return value}
					},
					points:[{}]
				},p);
			},
			initEvent:function(){
				
			},
			initView:function(){
				var param=configuration.p;
				var $this=$(configuration.t);
				var container=$("<div></div>");
				container.css(param.containerStyle);
				
				param.mo={};
				$.each(param.points,function(){
					var pp=$.extend({},param.pointModel,this);
					var pointDiv=$("<div pointKey='"+pp.pointKey+"'></div>");
					container.append(pointDiv);
					
					$.each(this.labels,function(){
						var pp=$.extend({},param.labelModel,this);
						eval("param.mo['"+pp.name+"']=pp");
						var labelDiv=$("<div target='"+pp.name+"'></div>");
						labelDiv.append("<span>"+pp.title+"</span>");
						labelDiv.append("<span name='"+pp.name+"'>"+pp.defaults+"</span>");
						labelDiv.append("<span>"+pp.unit+"</span>");
						param.labelStyle.left=pp.left;
						param.labelStyle.top=pp.top;
						labelDiv.css(param.labelStyle);
						if (pp.color) {
							labelDiv.css("color",pp.color)
						}
						if(pp.weight) {
							labelDiv.css("fontWeight",pp.weight)
						}
						
						pointDiv.append(labelDiv);
					});
				});
				$this.append(container);
			},
			drawData:function(data){
				var param=configuration.p;
				var $this=$(configuration.t);
				for(var pointName in data){
					var labelData=data[pointName];
					labelData=$.extend({},param.dataModel,labelData);
					var pointDiv=$this.find("div[pointKey='"+labelData.pointKey+"']");
					for(var name in labelData){
						if(name=='pointKey'){
							continue;
						}
						var value=labelData[name];
						var pp;
						eval("pp=param.mo['"+name+"']");
						if(pp&&pp.format){
							value=pp.format.apply($this.find("span[name='"+name+"']").get(0),[value]);
						}
						if(value){
							pointDiv.find("span[name='"+name+"']").text(value);
						}
					}
				}
			},
			drawConfigData:function(data,closeFunc){
				var param=configuration.p;
				var $this=$(configuration.t);
				for(var pointName in data){
					var labelData=data[pointName];
					labelData=$.extend({},param.dataModel,labelData);
					var pointDiv=$this.find("div[pointKey='"+labelData.pointKey+"']");
					for(var name in labelData){
						if(name=='pointKey'){
							continue;
						}
						var value=labelData[name];
						var pp;
						eval("pp=param.mo['"+name+"']");
						if(pp&&pp.format){
							value=pp.format.apply($this.find("span[name='"+name+"']").get(0),[value]);
						}
						if(value){
							pointDiv.find("span[name='"+name+"']").text(value);
						}
					}
				}
			},
			reload:function(){
				configuration.initParam(t,p);
				configuration.initEvent();
				configuration.initView();
				configuration.drawData(p.data);
			}
		}
		t.configuration=configuration;
		configuration.reload();
		return configuration;
	};
	$.fn.configuration=function(p){
		this.each(function(){
			if(!this.configuration){
				this.configuration=$.configuration(this,p);
			}else{
				this.configuration.initParam(this,p);
				this.configuration.initEvent();
				this.configuration.initView();
				this.configuration.drawData(p.data);
			}
		});
	}
	$.fn.drawData=function(data){
		this.each(function(){
			if(this.configuration){
				this.configuration.drawData(data);
			}
		});
	}
})(jQuery)