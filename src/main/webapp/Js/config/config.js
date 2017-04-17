$(function(){
	$('#grid').datagrid(option);
	$('#submit').bind('click',function(){
		var picid=$('#picid').val();
		var objid=$('#objid').val();
//		var enname=$('#enname').val();
		var enname =$('#enname').val().split(',');
		var str='['+$('#config').val()+']';
		var re=/\/\/.+[\r\n]/g;
		var xx=str.replace(re,'');
		var json=JSON.parse(xx);
		$('#total').val(json.length);
		var success=0;
		var sum=0;
		var data=[];
		$.each(json,function(i,n){
			sum++;
			var config={
					
			}
			 
			
			if(null!=enname&&""!=enname&&enname.length>0){
				$.each(enname,function(i1,n1){
					if(!(n.name.indexOf(n1)<0)){
						config.enname=n1;
						config.objid=n.name.split(n1)[1];
					} 
				})
				if(null==config.enname||null==config.objid){
					console.log(n.name +" 无法找到匹配的字段名,请重新导入!");
//					continue;
					return true;
				} 
			}else{
				config.enname=n.name.split(objid)[0];
				config.objid=objid;
				
			}
			config.picid=picid;
			config.formatter=(null==n.format)?"":n.format
			config.remark= (null==n.remark)?"":n.remark;
			config.title=(null==n.title)?"":n.title;
			config.unit=(null==n.unit)?"":n.unit;
			config.x= (null==n.left)?"":n.left.split('px')[0];
			config.y=(null==n.top)?"":n.top.split('px')[0]; 
			config.color=(null==n.color)?"":n.color;
			config.weight=(null==n.weight)?"":n.weight;
			executeAjaxUrlForResult("configImport/save", {data:config,async:false}, function(result){
				if(result.success){
					success++;
					data.push(config);
				}
			});
		});
		$('#success').val(success);
		$('#total').val(sum);
		$('#grid').datagrid('loadData',data);
	});
	
	
	})
	var option = {
			data:[],
			fitColumns:true,
	        columns: [[// { field: 'name', title: '名称', width: 100 },
            {
                field: 'enname',
                title: 'enname',
                width: 100
            },
            {
                field: 'objid',
                title: 'objid',
                width: 100
            },
            {
                field: 'picid',
                title: 'picid',
                width: 100
            },
            {
                field: 'formatter',
                title: 'formatter',
                width: 100
            },
            {
                field: 'remark',
                title: 'remark',
                width: 100
            },
            {
                field: 'title',
                title: 'title',
                width: 100
            },
            {
                field: 'unit',
                title: 'unit',
                width: 100
            },
            {
                field: 'x',
                title: 'x',
                width: 100
            },
            {
                field: 'y',
                title: 'y',
                width: 100
            },
            {
                field: 'color',
                title: 'color',
                width: 100
            },
            {
                field: 'weight',
                title: 'weight',
                width: 100
            }
            
             ]],
	    };
	
	var formatter={
			"formatFailAndUncontact":1,
			
	}
