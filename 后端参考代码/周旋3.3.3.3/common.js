function check(res) {
    // 对获取到的json数据进行格式上的检查
    if (!res.data.hasOwnProperty('success') || !res.data.hasOwnProperty('message') || !res.data.hasOwnProperty('data')) return false;
    if (typeof res.data.data != "object") return false;
    return true;
}