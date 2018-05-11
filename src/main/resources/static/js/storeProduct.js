(function(){

var app = angular.module("storeProduct",[]);

app.controller("ProductPriceController",['$http', function($http){
       var controller = this;
       controller.storeProduct = [];


       $http.get("/productPrice").success(function(data){
                controller.storeProduct = data;
       });

}]);
})();