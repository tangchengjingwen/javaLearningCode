/**
 * @author Administrator
 */

/**
 * �����ȡ���ֵ�ķ����� 
 */

Array.prototype.getMax = function(){
	
	var temp = 0;
	for(var x=1; x<this.length; x++){
		if(this[x]>this[temp]){
			temp = x;
		}
	}
	return this[temp];
}

/*
 * ������ַ���������ʽ�� 
 * ����toString������ �൱��java�еĸ�д�� 
 * 
 */
Array.prototype.toString = function(){
	
	return "["+this.join(", ")+"]";
}





