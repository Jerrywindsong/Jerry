from flask import Blueprint, request

example = Blueprint('example', __name__, url_prefix='/example')

@example.route('get_user')
def get_user():

    return {
        'success': True,
        'message': '',
        'data': {
            'name': 'xiaow',
            'age': 20,
            'sex': '男',
            'identify': 'student'
        }
    }

@example.route('set_user', methods=['POST'])
def set_user():

    json_param = request.get_json()
    print(json_param)
    print(type(json_param))
    #dth(json_param) #做一些数据增删改查操作 
    return {
        'success': True,
        'message': '',
        'data': {}
    }