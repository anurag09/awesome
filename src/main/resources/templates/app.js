(function(){

 var app = angular.module('product', ['CarsController']);

 app.controller('ProductController', ['$http', function($http){

    var controller = this;
    controller.products = [];

    $http.get("/products").success(function (data) {
              controller.products = data;
            }
       );
}]);

app.controller('CarsController',function($scope){
    $scope.carList = [
        {
            Car:{
                name : "Scorpio",
                model : "Mahindra",
            },
            Car:{
                name : "Swift Desire",
                model :"Suzuki"
             }

        }
    ];
});

})();
