var serviceBmi = {
    
    calculateBMI:function(weight, height, callback){
        
        $.ajax({
		  url: 'BMIController',
		  data: {'weight': weight, 'height': height},
		  success: function(result) {
		  	callback(parseFloat(result));
		  },
		  error: function() {		  	
		  }
		});
        
    
    }


};