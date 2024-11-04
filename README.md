# :moneybag: Lotto Simulator  

Lotto Simulator는 1부터 45 사이의 중복되지 않는 숫자 6개를 추첨하는 로또 시뮬레이션 프로그램입니다.  
Lotto Simulator와 함께 여러분의 행운을 확인해보세요! :four_leaf_clover:  

## :rocket: Usage  

---
1. 로또 구입 금액을 입력하세요.
    ```
    예시) 
    구입금액을 입력해 주세요.
    8000
    ```
    > [!NOTE]  
    > 로또 한 장의 가격이 1,000원이므로 **1,000원 단위로 입력**해야 합니다.  
    
2. 구입 금액에 따라 발행된 로또 수량과 각 로또의 번호가 출력됩니다.
    ```
    예시) 
    8개를 구매했습니다.
    [8, 21, 23, 41, 42, 43] 
    [3, 5, 11, 16, 32, 38] 
    [7, 11, 16, 35, 36, 44] 
    [1, 8, 11, 31, 41, 42] 
    [13, 14, 16, 38, 42, 45] 
    [7, 11, 30, 40, 42, 43] 
    [2, 13, 22, 32, 38, 45] 
    [1, 3, 5, 14, 22, 45]
    ```   
   
3. 당첨 번호를 입력하세요. 
    ```
    예시) 
    당첨 번호를 입력해 주세요.
    1,2,3,4,5,6
    ```
    > [!NOTE]  
    > 당첨 번호는 **1부터 45 사이의 중복되지 않는 숫자 6개로, 각 번호는 쉼표(,)로 구분**됩니다.  

4. 보너스 번호를 입력하세요.
    ```
    예시)
    보너스 번호를 입력해 주세요.
    7
    ```
    > [!NOTE]  
    > 보너스 번호는 **당첨 번호와 겹치지 않는 1부터 45 사이의 숫자 1개**입니다.  

5. 당첨 결과에 따른 당첨 통계(당첨 내역, 수익률)이 출력됩니다.
     ```
    예시)
    당첨 통계
    ---
    3개 일치 (5,000원) - 1개
    4개 일치 (50,000원) - 0개
    5개 일치 (1,500,000원) - 0개
    5개 일치, 보너스 볼 일치 (30,000,000원) - 0개
    6개 일치 (2,000,000,000원) - 0개
    총 수익률은 62.5%입니다.
    ```

## :hammer_and_pick: 구현 기능 목록

---
- [X] 사용자로부터 로또 구입 금액을 입력받는다.
- [X] 구입 금액에 대한 유효성을 검증한다.
    - 양수가 입력되었는가
    - 1,000(로또 구매 금액 단위)으로 나누어 떨어지는가
    - 최대 구매가능 금액(1,000,000)을 초과하는가
- [X] 사용자가 잘못된 구입 금액을 입력한 경우, 에러 메시지를 출력한 뒤 최대 3번까지 재입력 받는다.
- [X] 로또 발행 수량을 출력한다.
- [X] 발행 수량만큼 로또를 발행한다. 이때, 로또는 아래 조건을 만족한다.
    - 로또는 중복되지 않는 6개의 숫자로 이루어진다.
    - 로또 번호의 숫자 범위는 1이상 45이하 이다.
- [X] 발행한 로또 번호를 출력한다. 이때, 로또 번호는 오름 차순으로 정렬한다.
- [X] 사용자로부터 당첨 번호를 입력받는다.
- [X] 당첨 번호에 대한 유효성을 검증한다.
    - 쉼표로 구분되는 서로 다른 6개의 양수가 입력되었는가
    - 모든 양수가 로또 번호 범위(1이상 45이하) 안에 있는가
- [X] 사용자가 잘못된 당첨 번호를 입력한 경우, 에러 메시지를 출력한 뒤 최대 3번까지 재입력 받는다.
- [X] 사용자로부터 보너스 번호를 입력받는다.
- [X] 보너스 번호에 대한 유효성을 검증한다.
    - 양수가 입력되었는가
    - 양수가 로또 번호 범위(1이상 45이하) 안에 있는가
    - 당첨 번호와 겹치지 않는가
- [X] 사용자가 잘못된 보너스 번호를 입력한 경우, 에러 메시지를 출력한 뒤 최대 3번까지 재입력 받는다.
- [X] 당첨 통계(당첨 내역, 수익률)를 계산한다.
- [X] 당첨 내역을 정해진 형식에 따라 출력한다.
    - 형식
    - | 3개 일치 (5,000원) - a개             |
        |---------------------------------|
      | 4개 일치 (50,000원) - b개               |
      | 5개 일치 (1,500,000원) - c개            |
      | 5개 일치, 보너스 볼 일치 (30,000,000원) - d개 |
      | 6개 일치 (2,000,000,000원) - e개        |
- [X] 수익률을 소수 둘째 자리에서 반올림하여 출력한다.