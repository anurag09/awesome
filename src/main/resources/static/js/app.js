(function(){

 var app = angular.module('product', []);

 app.controller('ProductController', ['$http', function($http){

    var controller = this;
    controller.products = [];

    $http.get("/products").success(function (data) {
              controller.products = data;
            }
       );
}]);

})();
