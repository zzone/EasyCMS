(function(window) {
	var Pony = {version : '1.0'};
	
	/**
	 * 获取路径参数
	 */
	Pony.getParam = function(key) {
		var kv,params = location.search.substr(1).split('&');
		for (var i = 0;i < params.length; i++) {
			kv = params[i].split('=');
			if (kv[0] == key) {
				return kv[1];
			}
		}
	};

	/**
	 * 选中复选框.
	 */
	Pony.checkbox = function(name, checked) {
		
	};
	/**
	 * 复选框选中的个数
	 */
	Pony.checkedCount = function(name) {
		var batchChecks = document.getElementsByName(name);
		var count = 0;
		for (var i = 0;i < batchChecks.length; i++) {
			if (batchChecks[i].checked) {
				count++;
			}
		}
		return count;
	};
	window.Pony = Pony;
})(window);