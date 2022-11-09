var app = angular.module('app', []);
app.controller("todoController",function($scope) {
  $scope.list = [{
      name: "Testing",
      completed: true
    },
    {
      name: "test1",
      completed: false
    },
    {
      name: "app wasn't working",
      completed: true
    },
    {
      name: 'testing 2',
      completed: true
    }
  ]
  $scope.message="heii";
});