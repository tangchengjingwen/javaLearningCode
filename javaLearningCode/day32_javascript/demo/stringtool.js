/**
 * @author Administrator
 */
/**
 * �ַ��������¹��ܣ�ȥ���ַ������˵Ŀո� 
 */
String.prototype.trim = function(){
				
	var start,end;
	start=0;
	end=this.length-1;
	
	while(start<=end && this.charAt(start)==' '){
		start++;
	}
	while(start<=end && this.charAt(end)==" "){
		end--;
	}
	
	return this.substring(start,end+1);

}
			

/**
 * �ַ����¹��ܣ����һ�����ַ���ת���ַ����顣 
 * ����һ������
 */
String.prototype.toCharArray = function(){
	
	//����һ�����顣
	var chs = [];
	//���ַ����е�ÿһλ�ַ��洢���ַ������С� 
	for(var x=0; x<this.length; x++){
		
		chs[x] = this.charAt(x);
	}
	
	return chs;
	
}


/**
 * ���һ�������ַ������з�ת�ķ����� 
 */

String.prototype.reverse = function(){
	
	
	var arr = this.toCharArray();
	
	//������λ���û����ܽ��з�װ�������嵽�˷�ת�����ڲ��� 
	function swap(arr,a,b){
		var temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	for(var x=0,y=arr.length-1;  x<y ; x++,y--){
		
		swap(arr,x,y);
	}
	return arr.join("");
}
/*
String.prototype.toString = function(){
	
	return "mystring:"+this;
}

*/






