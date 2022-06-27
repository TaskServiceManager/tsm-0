angular.module('tsm', ['ngStorage']).controller('indexController', function ($scope, $rootScope, $http, $localStorage){
 const contextPath = 'http://localhost:8189/tsm/tails/';
function alert(message, type) {
     var alertPlaceholder = document.getElementById('AlertInAssign');
       var wrapper = document.createElement('div');
       wrapper.innerHTML = '<div class="alert alert-' + type + ' alert-dismissible" role="alert">' + message + '<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button></div>';

       alertPlaceholder.append(wrapper);
     }
     console.log('10');

    $scope.getAllTails = function () {
            $http.get(contextPath)
                .then(function (response) {
                console.log('getTails');
                    $scope.MyTails = response.data;
                });
        }
    $scope.getAllTails();


    $scope.cut = function (income) {

                $http.get(contextPath + 'delete/'+$scope.cutDetails.id)
                    .then(function (response) {
                        console.log(response.data);
                        $scope.getAllTails();
                    });
            }
    console.log('25');
    $scope.create = function () {
                $http({
                     url: contextPath ,
                     method: 'POST',
                     data:  $scope.tailDetails

                 }).then(function successCallback(response) {
                     alert('успешно','success');
                     $scope.getAllTails();

                 }, function errorCallback(response) {
                     alert('Что-то пошло не так - попробуйте позже..' +response.data,'danger');
                     $scope.getAllTails();

                 });
             };


    console.log('43');


});