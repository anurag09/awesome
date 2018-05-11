(function(){

var app = angular.module("category", []);

app.controller("CategoryController", ['$http', function($http){

      var controller = this;
      controller.category;
      controller.categories = [];

          $http.get("/category/1").success(function (data) {
                    controller.category = data;
                  }
             );

          $http.get("/categories").success(function (data) {
                              controller.categories = data;
                            }
                       );

}]);

})();


