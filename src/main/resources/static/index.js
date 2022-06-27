

angular.module('tsm-front').controller('indexController', function ($rootScope, $scope, $http, $location, $localStorage) {
 const contextPath = 'http://localhost:8189/tsm/tails/';


    $scope.getAllTails = function () {
            $http.get(contextPath + )
                .then(function (response) {
                    $scope.MyTails = response.data;
                });
        }
    $scope.cut = function (id) {
                $http.get(contextPath + 'delete/{'+id+'}')
                    .then(function (response) {
                        console.log(response.data);
                    });
            }


    getAllTails();


});