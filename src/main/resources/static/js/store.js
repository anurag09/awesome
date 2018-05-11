(function(){

var app = angular.module("store",[]);

app.controller("StoreController", ['$http', function($http){

      var controller = this;
      controller.stores = [];

          $http.get("/stores").success(function (data) {
                    controller.stores = data;
                  }
             );

}]);

})();