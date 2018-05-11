(function(){

var app = angular.module("car",[]);

app.controller('CarsController',function($scope,$http){
    $scope.carList = [
            {
                name : "Scorpio",
                model : "Mahindra",
            },
            {
                name : "Swift Desire",
                model :"Suzuki"
             }

    ];

   $http.get("http://localhost:8080/product/1").then(function(response){
     $scope.product = response.data;
   });

     $scope.addCar = function(){
            var car = {
            name: $scope.name,
            model: $scope.model,
        };

        $scope.carList.push(car);
      };

 $scope.removeCar = function(index){
    $scope.carList.splice(index, 1);
  }

});



})();